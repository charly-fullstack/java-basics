const revealElements = document.querySelectorAll(
  ".hero-text, .hero-card, .project-card, .about-card, .timeline-item, .contact"
);

const observer = new IntersectionObserver(
  (entries) => {
    entries.forEach((entry) => {
      if (entry.isIntersecting) {
        entry.target.classList.add("visible");
        observer.unobserve(entry.target);
      }
    });
  },
  { threshold: 0.2 }
);

revealElements.forEach((element, index) => {
  element.classList.add("reveal");
  element.style.transitionDelay = `${index * 80}ms`;
  observer.observe(element);
});
